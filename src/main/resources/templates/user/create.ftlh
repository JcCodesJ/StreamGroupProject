<#include "../index.ftlh">
<layout>
    <if errors??>
        <list error as error>
            ${error.field} incorrect
        </list>
    </if>
    <h1>Creation of a new user</h1>
    <form method="post" action="/user/create">
        <div class="input-field">
            <label for="username">Username</label>
            <input name="username" id="username">
        </div>
        <div class="input-field">
            <label for="password">Password</label>
            <input name="password" id="password" type="password">
        </div>
        <button type="submit">Add</button>
    </form>
</layout>