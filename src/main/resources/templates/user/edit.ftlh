<#include "../index.ftlh">
<@layout>
    <h1>Modifier l'utilisateurs</h1>
    <form method="post" action="/user/edit/${user.id}">
        <div class="input-field">
            <label for="username">Username</label>
            <input name="username" id="username" value="${user.username}">
        </div>
        <div class="input-field">
            <label for="password">Password</label>
            <input name="password" id="password" type="password" value="${user.password}">
        </div>
        <button type="submit">Modifier</button>
    </form>
</@layout>
