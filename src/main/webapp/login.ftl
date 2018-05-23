<#assign s=JspTaglibs["/struts-tags.tld"] />
<@s.form action="login">
<@s.textfield name="username" label="账号"/>
<@s.textfield name="pwd" label="密码"/>
<@s.submit value="login" />

<@s.text name='tradeType'/>
</@s.form >