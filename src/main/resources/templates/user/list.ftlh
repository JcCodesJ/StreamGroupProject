<#include "../index.ftlh">
<@layout>
    <a href="/user/create">Ajouter des utilisateurs</a>
    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Username</th>
            <th>Created At</th>
            <th>Updated At</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <#list users as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.createdAt}</td>
                <td>
                    <#if user.updatedAt??>
                        ${user.updatedAt}
                    </#if>
                </td>
                <td>
                    <div>
                        <a href="/user/edit/${user.id}">Modifier</a>
                    </div>
                    <div>
                        <a href="/user/delete/${user.id}">Supprimer</a>
                    </div>
                </td>
            </tr>
        </#list>
        </tbody>
    </table>
</@layout>
