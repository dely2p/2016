<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	var recordingPlayer = $("video");
	var audio = new Audio();
	audio.src = "";
	audio.controls = true;
	recordingPlayer.parentNode.appendChild(document.createElement('hr'));
	recordingPlayer.parentNode.appendChild(audio);

	if(audio.paused) audio.play();

	audio.onended = function() {
	    audio.pause();
	    audio.src = URL.createObjectURL(button.recordRTC.blob);
	};

})
</script>
</head>
<body>
 <audio src="Superfantastic.mp3" controls autoplay loop> 

</body>
</html>