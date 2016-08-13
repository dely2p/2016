	var ctx;
		var cnt = 0;
		var count = 0;
		var score = 0;

		// 캔버스 객체
		var canvas;

		// 게임진행 flag
		var gameFlag = true;
		
		// 우주배경 이미지 객체
		var bgImg1 = new Image();
		var bgImg2 = new Image();
		// 배경 이미지 소스
		bgImg1.src = "../images/space.jpg";
		bgImg2.src = "../images/space.jpg";
		var bgY1 = 0;
		var bgY2 = -600;
		// 비행기 이미지 객체
		var ship1 = new Image();
		var ship2 = new Image();
		var ship3 = new Image();
		var ship4 = new Image();
		// 적비행기 이미지 객체
		var ship5 = new Image();
		var ship6 = new Image();
		var ship7 = new Image();
		var ship8 = new Image();
		// 소스
		ship1.src = "../images/gunship4.png";
		ship2.src = "../images/gunship5.png";
		ship3.src = "../images/gunship6.png";
		ship4.src = "../images/gunship7.png";
		ship5.src = "../images/gunship0.png";
		ship6.src = "../images/gunship1.png";
		ship7.src = "../images/gunship2.png";
		ship8.src = "../images/gunship3.png";
		// 비행기 좌표 변수
		var shipX1 = 250;
		var shipY1 = 500;
		// 적 비행기 x,y 좌표
		var shipX2 = 100;
		var shipY2 = 100;

		// 적비행기 속도
		var enermySpeed = 5; 

		var missileSound = new Audio("../sounds/missile.wav");
		var ex = new Audio("../sounds/explosion.wav");

		// 미사일 이미지 객체
		var missileImg = new Image();
		missileImg.src = "../images/missile1.png";

		// 미사일의 y좌표 변수
		var missileX = -100;
		var missileY = 500;

		// 미사일 배열
		var missileArray = [];

		var enermyArray = [];


		function moveShip(e){
			//console.log("비행기 움직이기");
			var key = e.keyCode;
			if(key==37)
				shipX1 -= 2;
			else if(key==38)
				shipY1 -= 2;
			else if(key==39)
				shipX1 += 2;
			else if(key==40)
				shipY1 += 2;

			shipX1 = e.x;
			shipY1 = e.y;
			
		}
		function fireMissile(e){
			console.log("미사일발사~~~");
			var key = e.keyCode;
			if(key==32){
				//console.log("미사일 발사");
				missileSound.currentTime = 0;
				missileSound.play();
				cnt++;
				var m = {
					"X": shipX1,
					"Y": shipY1
				};
				//console.log(" 스페이스바 눌림!!");
				if(cnt%2==0) m.X+=21;
				else m.X-=25;
				missileArray.push(m);
				//console.log(m.X+" "+m.Y);
			}
			return flase;
			
		}
		window.onload = function(){ // play game
			canvas = document.getElementById("myCanvas");
			ctx = canvas.getContext("2d");

			/*document.body.onkeydown = moveShip;*/
			console.dir(canvas);
			//canvas.onkeydown = fireMissile;
			document.body.onkeydown = fireMissile;
			canvas.onmousemove = moveShip
			setInterval(drawScreen,30);
		}
		function makeEnermey(){
			// 객체
			var e = {
				"X": Math.floor(Math.random()*400)+10,
				"Y": -50,
				"hp": 100,
				"isAlive" : true
			};
			enermyArray.push(e);
		}
		function drawScreen(){

			count++;							
			bgY1+=2;
			bgY2+=2;

			if(count %30 == 0) makeEnermey();

			// 미사일 이동
			missileY -=5;

			shipY2 +=3;

			// ctx.drawImage(이미지객체, x, y, 너비, 높이);
			ctx.drawImage(bgImg1, 0, bgY1, 400, 600);
			ctx.drawImage(bgImg2, 0, bgY2, 400, 600);
			if(bgY1>=600)
				bgY1 = -600;
			if(bgY2>=600)
				bgY2 = -600;

			// 비행기 그리기
			if(count%4==0){
				ctx.drawImage(ship1, shipX1-25, shipY1-10, 50, 50);				
			}
			else if(count%4==1){
				ctx.drawImage(ship2, shipX1-25, shipY1-10, 50, 50);				
			}
			else if(count%4==2){
				ctx.drawImage(ship3, shipX1-25, shipY1-10, 50, 50);				
			}
			else if(count%4==3){
				ctx.drawImage(ship4, shipX1-25, shipY1-10, 50, 50);
			}

			// 적군 비행기 그리기
			for(var i=0;i<enermyArray.length;i++){
				var e = enermyArray[i];

				e.Y += enermySpeed; 
				//console.log(e.X+" "+e.Y);
				/*e.Y +=5;*/
				if(count%4==0){					
					ctx.drawImage(ship5, e.X-25, e.Y-10, 50, 50);
				}
				else if(count%4==1){					
					ctx.drawImage(ship6, e.X-25, e.Y-10, 50, 50);
					}
				else if(count%4==2){					
					ctx.drawImage(ship7, e.X-25, e.Y-10, 50, 50);
				}
				else if(count%4==3){					
					ctx.drawImage(ship8, e.X-25, e.Y-10, 50, 50);
				}

				if(e.Y>=600) 
					//enermyArray.shift();
					enermyArray.splice(i,1);
			}
			// 미사일 그리기
			//ctx.drawImage(missileImg,missileX,missileY,5,20);

			for(var i=0;i<missileArray.length;i++){
				var m = missileArray[i];
				ctx.drawImage(missileImg,m.X,m.Y,5,20);
				//console.log("X : "+ma.X+"Y : "+ma.Y);
				m.Y-=5;

				if(m.Y<=-20) missileArray.splice(i,1);
				//console.log(missileArray);
			}

			ctx.font = "50px 고딕";
			ctx.fillStyle = "red";
			ctx.fillText("SCORE : "+score,50,50);

			checkCollision(); // 충돌체크
			//  내 비행기와 적 비행기가 충돌하는지 검사
			checkCollision2();

			if(!gameFlag){
				enermySpeed = 0;
				canvas.onmousedown = '';
				canvas.onmousemove = '';
				document.body.onkeydown ='';

				//console.log("게임 끝났어 집에가~~");

				ctx.font = "50px 고딕";
				ctx.fillStyle = "red";
				ctx.fillText("GAME OVER!",50,300);
			}
			
		}
		function pythagoras(x1,y1,x2,y2){
			return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		}
		function checkCollision(){
			//1. 미사일 배열에서 미사일 하나 꺼내기
			for(var i=0;i<missileArray.length;i++){
				var missile = missileArray[i];
			//2. 적비행기 배열에서 적비행기 하나 꺼내기
				for(var j=0;j<enermyArray.length;j++){
					var enermy = enermyArray[j];
			//3. 둘간의 거리를 측정
					var dis = pythagoras(missile.X,missile.Y,enermy.X+25,enermy.Y+25);
					if(dis<=20) {
						enermy.Y -= 5;
						enermy.hp -= 50;
						missile.y -= 20;
						if(enermy.hp<=0){
							enermyArray.splice(j,1);
							enermy.isAlive = false;
							score += 10;
							ex.currentTime = 0;
							ex.play();
						}
					}
				}
			}
			//4. 일정 거리 이하면 충돌
			//5. 충돌이라면 미사일과, 적비행기 각각의 배열에서 제거
			//6. 아니라면 1번부터 다시
		}
		function checkCollision2(){
			for(var i=0;i<enermyArray.length;i++){
				var enermy = enermyArray[i];
				var dis = pythagoras(enermy.X+25,enermy.Y+25,shipX1,shipY1);
				if(dis<=27) {
					gameFlag = false;					
				}
			}
		}
		function restart(){

			gameFlag = true;
			enermySpeed = 5;
			//document.body.onkeydown = fireMissile;
			document.body.onkeydown = fireMissile;
			canvas.onmousemove = moveShip;
			//console.log("다시시작");
			enermyArray = [];
			missileArray = [];
		}
		