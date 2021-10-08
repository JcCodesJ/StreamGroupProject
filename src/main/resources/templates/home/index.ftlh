<#include "../layout.ftlh">
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<a href="/user/edit/1">Link</a>
    <h1>Hello ${name}!</h1>
    <table>
        <list users as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
            </tr>
        </list>
    </table>
<div>
    ${Admin.id} - ${Admin.username} - ${Admin.password} - ${Admin.createdAt}
</div>
<if sUser??>
    <div>${sUser.username}</div>
</if>
</body>
</html>
