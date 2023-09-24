<jsp:useBean id="beatModel" scope="request" class="head_first_desing_patterns.section_12_complex.model2.BeatModel" />

<html>
<head>
    <title>DJ</title>
</head>
<body>
<h1>DJ</h1>
BPM=<jsp:getProperty name="beatModel" property="BPM"/>
<br/>
<hr>
<br/>

<form method="post" action="/dj/servlet/DJ">
    Nowa wartość BPM: <input type="text" name="bpm"> value="<jsp:getProperty name="beatModel" property="BPM"/>

    <input type="submit" name="set" value="set"><br />
    <input type="submit" name="increase" value="increase"><br />
    <input type="submit" name="decrease" value="decrease"><br />
    <input type="submit" name="start" value="start"><br />
    <input type="submit" name="stop" value="stop"><br />
</form>

</body>
</html>