<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width" />
<link rel="apple-touch-icon" href="logo.png" />
<link rel="icon" type="image/vnd.microsoft.icon" href="favicon.ico">
<link rel="icon" type="image/png" href="favicon.png">
<title>Red5 - OFLADemo</title>
<style type="text/css">
<!--
body {
    background-color:#680000;
    font-family: sans-serif;
    font-size: 0.9em;
}
.code {
    font-family: monospace;
    font-size: 130%;
}
a {
    color: red;
    background: white;
    text-decoration: none;
}
#information {
    padding-top: 1em;
    padding-bottom: 1em;
}
.spiffy{display:block}
.spiffy *{
  display:block;
  height:1px;
  overflow:hidden;
  font-size:.01em;
  background:#fff}
.spiffy1{
  margin-left:3px;
  margin-right:3px;
  padding-left:1px;
  padding-right:1px;
  border-left:1px solid #b60600;
  border-right:1px solid #b60600;
  background:#df0b00}
.spiffy2{
  margin-left:1px;
  margin-right:1px;
  padding-right:1px;
  padding-left:1px;
  border-left:1px solid #8c0100;
  border-right:1px solid #8c0100;
  background:#e60c00}
.spiffy3{
  margin-left:1px;
  margin-right:1px;
  border-left:1px solid #e60c00;
  border-right:1px solid #e60c00;}
.spiffy4{
  border-left:1px solid #b60600;
  border-right:1px solid #b60600}
.spiffy5{
  border-left:1px solid #df0b00;
  border-right:1px solid #df0b00}
.spiffyfg{
    padding:1em;
    background-color:#fff;
}
  -->
</style>
</head>
<body>
<script type='text/javascript' src='<%=request.getContextPath() %>/resources/red5/jwplayer.js'></script>
<div>
  <b class="spiffy">
  <b class="spiffy1"><b></b></b>
  <b class="spiffy2"><b></b></b>
  <b class="spiffy3"></b>
  <b class="spiffy4"></b>
  <b class="spiffy5"></b></b>
  
<div class="spiffyfg">

<p>This page demonstrates the use of <a href="http://www.longtailvideo.com/jw-player/" target="_blank">JWPlayer</a> to stream media from the OFLADemo application. If you want the classic version, click <a href="/demos/ofla_demo.html">here</a></p>

<center>
<b>RTMP</b>
<div id='mediaspace'>This text will be replaced</div>
<script type='text/javascript'>
  jwplayer('mediaspace').setup({
    'flashplayer': '<%=request.getContextPath() %>/resources/red5/player.swf',
    'file': 'Avengers2.mp4',
    'streamer': 'rtmp://127.0.0.1:1935/r5',
    'controlbar': 'bottom',
    'width': '848',
    'height': '360'
  });
</script>
<br />

<b>RTMPT</b>
<div id='mediaspace2'>This text will be replaced</div>
<script type='text/javascript'>
  jwplayer('mediaspace2').setup({
    'flashplayer': '<%=request.getContextPath() %>/resources/red5/player.swf',
    'file': 'Avengers2.mp4',
    'streamer': 'rtmpt://localhost:80/r5/',
    'controlbar': 'bottom',
    'width': '848',
    'height': '360'
  });
</script>
</center>

<br />
</div>

  <b class="spiffy">
  <b class="spiffy5"></b>
  <b class="spiffy4"></b>
  <b class="spiffy3"></b>
  <b class="spiffy2"><b></b></b>
  <b class="spiffy1"><b></b></b></b>
</div>
</body>
</html>
