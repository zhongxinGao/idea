<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>首页</title>
</head>
<body>
${name}
<#if sex == "1">
    男
    <#elseif sex == "2">
    女
    <#else >
    其他
</#if>
<#list  objects as user>
    ${user}
</#list>
</body>
</html>