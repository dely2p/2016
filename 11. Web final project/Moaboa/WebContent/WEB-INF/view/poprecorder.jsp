<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html>
<head>
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Audio Recorder</title>

	<script src="../assets/js/audiodisplay.js"></script>
	<script src="../assets/js/recorderjs/recorder.js"></script>
	<script src="../assets/js/main.js"></script>
	
	<style>
	html { overflow: hidden; }
	body { 
		font: 14pt Arial, sans-serif; 
		background: lightgrey;
		display: flex;
		flex-direction: column;
		height: 100vh;
		width: 100%;
		margin: 0 0;
	}
	canvas { 
		display: inline-block; 
		background: #202020; 
		width: 100%;
		height: 45%;
		box-shadow: 0px 0px 10px blue;
	}
	#controls {
		display: flex;
		flex-direction: row;
		margin-left: 30%;
		align-items: center;
		justify-content: space-around;
		height: 20%;
		width: 50%;
	}
	#saveorupload{
		display: flex;
		flex-direction: row;
		margin-left: 10%;
		align-items: center;
		justify-content: space-around;
		height: 50%;
		width: 40%;
	}
	#record { height: 50vh;}
	#upload { height: 50vh;}
	#record.recording { 
		background: red;
		background: -webkit-radial-gradient(center, ellipse cover, #ff0000 0%,lightgrey 75%,lightgrey 100%,#7db9e8 100%); 
		background: -moz-radial-gradient(center, ellipse cover, #ff0000 0%,lightgrey 75%,lightgrey 100%,#7db9e8 100%); 
		background: radial-gradient(center, ellipse cover, #ff0000 0%,lightgrey 75%,lightgrey 100%,#7db9e8 100%);
		 
	}
	#save, #save img { height: 50vh; }
	#save { opacity: 0.25;}
	#save[download] { opacity: 1;}
	#viz {
		height: 100%;
		width: 60%;
		display: flex;
		flex-direction: column;
		justify-content: space-around;
		align-items: center;
		margin-left: 10%; 
	}
	@media (orientation: landscape) {
		body { flex-direction: row;}
		#controls { flex-direction: column; height: 100%; width: 10%;}
		#viz { height: 100%; width: 30%;}
	}

	</style>
</head>
<body>
	<div id="viz">
		<canvas id="analyser" width="500" height="500"></canvas>
		<canvas id="wavedisplay" width="1024" height="500"></canvas>
	</div>
	<div id="controls">
		<img id="record" src="../assets/img/mic128.png" onclick="toggleRecording(this);">
		<div id="saveorupload">
			<a id="save" href="#" ><img src="../assets/img/save.png"></a>
				<form:form method="post" action="upload.do" commandName="uploadFile" enctype="multipart/form-data">
					<div style="width:30px; height:20px; background-image:url(../assets/img/upload.png);">
					<input type="file" name="file" id="" style="cursor:pointer; border:0xp; padding;0px; filter:alpha(opacity:0);" width="1px" height="21px">
					</div>
					<form:errors path="file" />	
					<input type="image" src="../assets/img/upload.png" name="submit" value="전송" align="absmiddle">
<!-- 			<a id="uploadfile" href=""><input type="submit" value="전송"><img id="save" src="../assets/img/upload.png" onclick="record(this);"></a> -->
				<!-- <img id="save1" src="../assets/img/upload.png" onclick="record(this);"> -->
			</form:form>
		</div>
	</div>
</body>
</html>