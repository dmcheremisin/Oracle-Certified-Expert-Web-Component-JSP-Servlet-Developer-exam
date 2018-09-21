<html>
<body>
<h1 align="center">Nested Classes Test</h1>

<h2>Map attributes test with dot . operator</h2>
<p>First: ${map.first}</p>
<p>Second: ${map.second}</p>
<p>Value through preset attribute: ${map.one}</p> <!-- this doesn't work -->

<h2>Map attributes test with brackets [] operator</h2>
<p>First: ${map["first"]}</p>
<p>Second: ${map["second"]}</p>
<p>Value through preset attribute: ${map[one]}</p> <!-- this works -->

<h2>Array values test with brackets [] operator</h2>
<p>Array itself: ${music}</p>
<p>First: ${music[0]}</p>
<p>Second: ${music["1"]}</p>

<h2>List values test with brackets [] operator</h2>
<p>List itself: ${favoriteFood}</p>
<p>First: ${favoriteFood[0]}</p>
<p>Second: ${favoriteFood["1"]}</p>

<h2>Combined list values access with brackets [] operator</h2>
<p>First: ${favoriteFood[numbers[0]]}</p>
<p>Second: ${favoriteFood[numbers[1]]}</p>
<p>Third: ${favoriteFood[numbers[1] + 1]}</p>

</body>
</html>