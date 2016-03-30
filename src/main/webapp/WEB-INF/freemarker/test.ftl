<html>
<head><title>liuwill.com - FreeMarker Spring MVC Hello World</title>
<body>
<div id="header">
    <H2>
        <a href="http://www.liuwill.com"><img height="37" width="236" border="0px" src="http://www.liuwill.com" align="left"/></a>
        FreeMarker Spring MVC Hello World
    </H2>
</div>

<div id="content">

    <fieldset>
        <legend>Add User</legend>
        <form name="user" action="add.html" method="post">
            Firstname: <input type="text" name="firstname" /> <br/>
            Lastname: <input type="text" name="lastname" />   <br/>
            <input type="submit" value="   Save   " />
        </form>
    </fieldset>
    <br/>
    <table class="datatable">
        <tr>
            <th>Firstname</th>  <th>Lastname</th>
        </tr>
    </table>

</div>
</body>
</html>