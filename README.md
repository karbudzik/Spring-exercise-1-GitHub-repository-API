# Queststore - JavaEE full-stack web application
Queststore is a web app for Codecool students to achieve quests and win artifacts, in order to **enhance and gamify learning process**.

The project itself was created by group of 4 students during the period of 6 weeks. It was an independent work of the team, starting from preparing DB structure and class graphs, creating logos, web designs, to execution and testing.

## General info
Portal has been divided into two parts: 
* **CMS for admins and mentors** - thanks to which people managing students in Codecool have a chance to add, edit, delete and view all students, teams, classes, quests and artifacts available in the portal.
* **online portal for students** - here students can log in, view available quests and artifacts, buy them, and see/edit details of their accounts, as well as their teams. 

## Features
### DONE: Admin portal/CMS
#### Log in as admin/mentor or student
A person can log in to the website, depending on their role. Unauthorized access is prevented using servlet filters.

![screenshot1](src/main/resources/img/screen1.png)

After loging in, the user's session is created and configured. User can also easily log out.

![screenshot2](src/main/resources/img/screen2.png)
#### Dashboard with summary of items existing in DB
After logging in to admin's/mentor's section, the dashboard is displayed. Here a user can view basic Codecool statistics and find links leading to dedicated sections.

![screenshot3](src/main/resources/img/screen3.png)
#### List view for all sections
As typical for CMS's layout, a user can view all available elements: mentors, admins, classes, teams, students, quests and artifacts.
**Sorting lists is possible for all tables**.

![screenshot5](src/main/resources/img/screen5.png)
#### Add new elements
Also, for all available sections, admin has a possibility to add new elements. **Forms used for that purpose are fully validated**.

![screenshot6](src/main/resources/img/screen6.png)
