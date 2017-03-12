# hibernate-liquibase

**Usage sequence:**
 1. Create docker images
 `docker-compose up --remove-orphans --force-recreate --build -d`
 2. remove existing diff file under following location
`db/changelog/changeSet/liquibase-diffChangeLog.xml`
 3. execute pre-configured **Diff** task. This will generate diff file under following path
`db/changelog/changeSet/liquibase-diffChangeLog.xml`
Verify the one if needed
 4. execute **Run and Apply changelog** task. This task will fire-up SpringBoot application and will apply liquibase diff file against postgres DB
 5. Check DB structure in **Database** tab of Intellij (use synchronise option on public schema and visualisation to get current DB representation)