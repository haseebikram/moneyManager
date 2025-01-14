<h1>About Money Manager</h1>
<h2 id="intro">Introduction</h2>
<p>Money Manager is a web application that helps the users visually see their finances. As they enter their weekly paycheck the application will ask for their bills and they can add or remove bills as they wish and at the end a result will be provided to them so that they can have a better idea of how they spend their money. Money Manager will allow the user to:</p>
<ul><li>Login</li>
<li>Add their weekly paycheck</li>
<li>Add their bills</li>
<li>Separate their finances into categories, such as shopping or electronics</li>
<li>The user can decide how they will save money</li>
<li>The app will provide a chart to make the numbers easier to look at</li></ul>
<h2 id="storyboard">Storyboard</h2>
<p><img src=".github/images/page1.PNG"/></p>
<p><img src=".github/images/page2.PNG"/></p>
<p><img src=".github/images/page4.PNG"/></p>
<p><img src=".github/images/page5.PNG"/></p>
<p><img src=".github/images/page6.PNG"/></p>
<h2 id="requirements">Functional Requirements</h2>
<h3>Requirement 100.0: Store, View and Edit Income</h3>
<h4>Scenario</h4>
<p>As a User, I want to be able to enter the various incomes that are available to me into the application to store it, so that I can view it or edit it later. This data should be available to other parts of the application for data comparisons.</p>
<p><strong>Examples:</strong></p>

   <p><strong>1.1</strong><br 
   /><strong>Given</strong> I have no stored income data in the application<br 
   /><strong>When</strong> I open the Money Manager Application<br 
   /><strong>Then</strong> I should be notified that I have no existing income data and I should be prompted to enter new income data<br 
   /><strong>1.2</strong><br 
   /><strong>Given</strong> I enter a new income item<br 
   /><strong>Then</strong> I should be prompted to select the relevant additional information (e.g., amount, frequency, etc.)<br 
   /><strong>1.3</strong><br 
   /><strong>Given</strong> I have previously stored income data in the application<br 
   /><strong>When</strong> I choose the View Income option<br 
   /><strong>Then</strong> my stored income data should be displayed in the application<br 
   /><strong>1.4</strong><br 
   /><strong>Given</strong> I have previously stored income data in the application<br 
   /><strong>Given</strong> I am viewing previously stored income data<br 
   /><strong>When</strong> I choose the Edit option for any given income entry<br 
   /><strong>Then</strong> each previously entered field for that income should be editable<br 
   /><strong>1.5</strong><br 
   /><strong>Given</strong> I have previously stored income data in the application<br 
   /><strong>Given</strong> I am viewing previously stored income data<br 
   /><strong>When</strong> I choose the Delete option for any given income entry<br 
   /><strong>Then</strong> the income item should be marked as deleted and removed from the list of income items<br 
   /><strong>1.6</strong><br
   /><strong>Given</strong> a stored income item is already existing in the Money Management Application<br
   /><strong>When</strong> I attempt to add the item again<br
   /><strong>Then</strong> I should receive a prompt notifying me that the item is already on the list with the option to cancel my entry, update the previously entry or add a duplicate item.</p>

<h3>Requirement 101.0: Store, View and Edit Debts &amp; Bills</h3>
<h4>Scenario</h4>
<p>As a User, I want to be able to enter the various debts and bills that I need to pay into the application to store it, so that I can view it or edit it later. This data should be available to other parts of the application for data comparisons.</p>

   <p><strong>1.1</strong><br 
   /><strong>Given</strong> I have previously stored income data in the application<br 
   /><strong>Given</strong> I have no stored bills data in the application<br 
   /><strong>When</strong> I open the Money Management Application<br 
   /><strong>Then</strong> I should be notified that I have not existing bill data and I should be prompted to enter new bill data<br 
   /><strong>1.2</strong><br 
   /><strong>Given</strong> I enter a new bill item<br 
   /><strong>Then</strong> I should be prompted to select the relevant additional information (e.g., amount, frequency, etc.)<br 
   /><strong>1.3</strong><br 
   /><strong>Given</strong> I have previously stored bill data in the application<br 
   /><strong>When</strong> I choose the View Bill option<br 
   /><strong>Then</strong> my stored bill data should be displayed in the application<br 
   /><strong>1.4</strong><br 
   /><strong>Given</strong> I have previously stored bill data in the application<br 
   /><strong>Given</strong> I am viewing previously stored bill data<br 
   /><strong>When</strong> I choose the Edit option for any given bill entry<br 
   /><strong>Then</strong> each previously entered field for that bill should be editable<br 
   /><strong>1.5</strong><br 
   /><strong>Given</strong> I have previously stored bill data in the application<br 
   /><strong>Given</strong> I am viewing previously stored bill data<br 
   /><strong>When</strong> I choose the Delete option for any given bill entry<br 
   /><strong>Then</strong> the bill item should be marked as deleted and removed from the list of bills<br 
   /><strong>1.6</strong><br 
   /><strong>Given</strong> a stored bill item is already existing in the Money Management Application<br 
   /><strong>When</strong> I attempt to add the item again<br 
   /><strong>Then</strong> I should receive a prompt notifying me that the item is already on the list with the option to cancel my entry, update the previously entry or add a duplicate item.</p>

<h3>Requirement 102.0: View a Summary of Income and Bills with a Debt-to-Income Ratio Graph</h3>
<h4>Scenario</h4>
<p>As a User, I want to be able to see a summary of my total income vs my total bills with a graphical interface that gives a visual representation of the summary.</p>
<h4>Dependencies</h4>
<p>Income and Bill items have been entered previously in the Money Management Application</p>
<p><strong>1.1</strong><br 
/><strong>Given</strong> I open the Money Management Application<br 
/><strong>Then</strong> I should see a summary of my previously entered income and bill items with a nice GUI highlighting the totals from each category<br 
/><strong>1.2</strong><br 
/><strong>Given</strong> I am viewing the Summary Menu<br 
/><strong>When</strong> I select Income Details<br 
/><strong>Then</strong> I should see a list of previously entered income items<br 
/><strong>1.3</strong><br 
/><strong>Given</strong> I am viewing the Summary Menu<br 
/><strong>When</strong> I select Bill Details<br 
/><strong>Then</strong> I should see a list of previously entered bill items</p>
<h3>Requirement 103.0: Generate Suggestions for Savings</h3>
<h4>Scenario</h4>
<p>As a User, I want to be able to use the Money Management Application to identify potential savings in my bills.</p>
<h4>Dependencies</h4>
<p>Recipes have previously been saved or favorited in the Money Management Application.</p>
<p><strong>1.1</strong><br
/><strong>Given</strong> I am viewing the Summary Menu<br
/><strong>When</strong> I choose Find Savings<br
/><strong>Then</strong> I should see a list of non-essential bills displayed with their total monthly cost </p>

<h2 id="diagram">Class Diagram</h2>
<p><img src=".github/images/ClassDiagram.png"/></p>
<h3>Class Diagram Description</h3>
<p>
   <strong>EnterpriseApplication:</strong> This class needed by SpringBoot to start the application.<br
   /><strong>MoneyManagerController:</strong> This is a User interface (UI) class.<br
   /><br/>
   <strong>DTO classes:</strong><br 
   /><strong>User:</strong> The class will hold user name and any possible data required for autehntication. <br 
   /><strong>Income:</strong> The class will hold any income information data such as source, ammount, and frequency available (yearly, monthly, biweekly,etc.).<br 
   /><strong>Bill:</strong> The class will hold the bill information such as source, payment, day due, and the category of the bill. <br
   /><strong>CategoryType:</strong> Enum class to hold possible categories to organize bill types such as housing, electricity, entertainment, etc.).<br
   /><br/>
   <strong>DAO classes:</strong><br 
   /><strong>IUserDAO/UserDAO:</strong> Will process the user data between the apllication and the database.<br
   /><strong>IIncomeDAO/IncomeDAO:</strong> Will process the income data between the apllication and the database.<br 
   /><strong>IBillDAO/BillDAO:</strong> Will process the bill data between the apllication and the database.<br
   /><br/>  
   <strong>Service classes:</strong><br 
   /><strong>ItemServices:</strong> Provides the required behaviors the classes below must implement for the business logic.<br 
   /><strong>IncomeService:</strong> This class will process the income data for any required function.<br
   /><strong>BillService:</strong> This class will process the bill data for any required function.<br
   /><strong>IncomeServiceStub:</strong> Contains temporaty income data to test the application until the database/dto is implemented.<br
   /><strong>BillServiceStub:</strong> Contains temporaty bill data to test the application until the database/dto is implemented. </p>
<h2 id="json">JSON Schema</h2>
This is the bill data to be exported to other apps.

```
{
   "type" : "object",
   "properties" : {
      "bill" : {
         "type" : "string"
      },
      "ammount" : {
         "type" : "double"
      },
      "dayDue" : {
         "type" : "integer"
      },
      "category" : {
         "type" : "string"
      }
   }
}
```

Income:

```
{
   "type" : "object",
   "properties" : {
      "bill" : {
         "type" : "string"
      },
      "ammount" : {
         "type" : "number"
      },
      "dayDue" : {
         "type" : "integer"
      },
      "category" : {
         "type" : "string"
      }
   }
}
```

User data:

```
{
   "type" : "object",
   "properties" : {
      "LName" : {
         "type" : "string"
      },
      "FName" : {
         "type" : "string"
      }
   }
}
```
<h2 id="roles">Scrum Roles</h2>
<ul>
<li>Alainna Nichols - Business Logic</li>
<li>Mamadou Kone - UI Specialist</li>
<li>Richard Woessner -  Scrum master</li>
<li>Juan Lopez Rosado - Developer</li>
</ul>
<h2 id="github">Github URL</h2>
<h3><a href="https://github.com/Richard-Woessner/moneyManager" target="_blank">Money Manager on GitHub</a></h3>
<h2 id="scrum">Scrum Board</h2>
<h3><a href="https://trello.com/b/zgP0FG7V/moneymanager" target="_blank">Our Board in Trello</a></h3>
<h2 id="teams">Link to Teams</h2>
<h3><a href="https://teams.microsoft.com/l/meetup-join/19%3ameeting_N2I0NzliMzgtNTNiOS00MWU2LWJlZmUtMjAxYTM5MGM4MTZm%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%224e12a843-0809-4a17-b8d9-7017f7b12776%22%7d" target="_blank">Teams Meeting</a></h3>
