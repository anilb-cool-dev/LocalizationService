# LocalizationService
This service allows you to retrieve a localized string based on an id and language code

Modify tomcat-users.xml

<tomcat-users>
  <role rolename="manager-gui"/>
  <role rolename="manager-script"/>
  <user username="admin" password="s3cret" roles="manager-gui,manager-script"/>
</tomcat-users>

Add following to settings.xml under maven
<servers>
        <server>
            <id>mytomcat</id>
            <username>admin</username>
            <password>s3cret</password>
        </server>
    </servers>	