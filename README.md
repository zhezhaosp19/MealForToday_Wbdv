# CS5610 - Finale Project - MealForToday


## Open-source API/libraries
TheMealDB: https://www.themealdb.com/api.php

## Possible users 
<ul>
   <li>Goals: 
       <ol>- Chef: publish meals recipe (Create, Browse, Edit, Delete)</ol>
       <ol>- Public user: search recipe by keyword, comment and publish cooking results in each recipe page (findRecipebyName)</ol>
       <ol>- Admin: delete plagiaristic recipes (if some recipes are reported cheating from someone) (Delete)</ol>
   </li>
<ul/>
## Strategy: 
<ul>
    <li>Registration:
        <ol>- Users can register account, login, and logout</ol>
        <ol>- User can view detail profiles
            <ol>1. User’s own profile: can view and update.</ol>
            <ol>2. Other user’s profile: can view partial public information.</ol>
        </ol>
    </li>
    <li>
        Searching:
        <ol>
        - User can filter by different categories of food</ol>
        <ol>- Users can search for recipes, chefs that they’re interested in based on keywords</ol>
    </li>
    <li>
    Detail Recipe:
        <ol>- In each recipe page, there are ingredients, detailed steps of cooking, images showing each step and the final result</ol>
        <ol>- Users can comments on the recipe posted by others and share what they have done in each recipe page</ol>
    </li>
    <li>
    Posing New Recipe:
        <ol>- Chef can post new recipe under one specific category</ol>
        <ol>- Chef can update and delete their created recipes</ol>
     </li>
    <li>
     Management:
       <ol>- Admin can delete plagiaristic recipe</ol>
    </li>
 </ul>

## Web pages:
<ul>
    <li> Home page: 
        <ol>1. This is also the landing page users will see when they visit our website. </ol>
        <ol>2. Content including randomly generalized recipe cards.</ol>
        <ol>3. Before login, users can view, search, and open detailed recipe information but are unable to comment and save.</ol>
    </li>
    <li> User login: 
        <ol>1. Login form</ol>
        <ol>2. Link to registration page</ol>
    </li>
    <li> Register
        <ol>1. Register form contains :
            <ol>a. Username(required)</ol>
            <ol>b. Password(required)</ol>
            <ol>c. Email(required)</ol>
            <ol>d. Phone number</ol>
            <ol>e. Profile picture</ol>
        </ol>
        <ol>2. Will render to the User Login page after an account has been successfully created.</ol>
    </li>
    <li>User profile
        <ol>1. Display public information including username, profile picture.</ol>
        <ol>2. Private information like password, email will be hidden for other users.</ol>
        <ol>3. Users are allowed to update their own profile.</ol>
    </li>
    <li> Search Result
        <ol>1. Display recipe cards based on user’s input information</ol>
        <ol>2. Can navigate to the Detail Recipe page after clicking a specific recipe card.</ol>
    </li>
    <li> Detail Recipe information 
        <ol>1. Display recipe’s picture, description, ingredients, measures, and comments.</ol>
        <ol>2. Users can post, edit their own comment, and save/ favorite  after logged in. </ol>
    </li>
    <li>  Post recipe
        <ol>1. This page can only be accessed by chef or admin. </ol>
        <ol>2. Post form including image, video, description, ingredients ,and measures.</ol>
     </li>
     </ul>
   

## Description of API:
<ul>
    <li>API: https://www.themealdb.com/api.php</li>
    <li>It’s an open online database of food meal recipes. It allows features like uploading meals with images, browsing meals in sequence, categorizing meals. Users can look up meals by name and id, they can list all categories, area, ingredients.</li>
    <li>Every meal uploaded has an unique id, name, category(e.g. “vegetarian” or “non vegetarian”), area(e.g. “Italian”, “Japanese”, etc.), cooking instructions, thumbnails, tags for keywords description(e.g. “pasta”, “curry”, etc.), youtube link for the meal cooking tutorial, ingredients and their measurements, date modified, and etc.</li>
    <li>Sample picture:
        https://user-images.githubusercontent.com/57330426/111953196-8922e580-8aa3-11eb-9445-0c4df0b75d51.jpg
    </li>
 </ul>

