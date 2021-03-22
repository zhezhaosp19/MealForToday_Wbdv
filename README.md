TheMealDB: https://www.themealdb.com/api.php

(1) Possible users - Goals: 
    - Chef: publish meals recipe (Create, Browse, Edit, Delete)
    - User: search recipe by keyword, comment and publish cooking results in each recipe page 
        (findRecipebyName)
    - Admin: delete plagiaristic recipes (if some recipes are reported cheating from someone) (Delete)
(2) Strategy: 
    a. Registration:
        - Users can register account, login, and logout
        - User can view detail profiles
            1. User’s own profile: can view and update.
            2. Other user’s profile: can view partial public information.
    b. Searching:
        - User can filter by different categories of food
        - Users can search for recipes, chefs that they’re interested in based on keywords
    c. Detail Recipe:
        - In each recipe page, there are ingredients, detailed steps of cooking, images showing each step and the final result
        - Users can comments on the recipe posted by others and share what they have done in each recipe page
    d. Posing New Recipe:
        - Chef can post new recipe under one specific category
        - Chef can update and delete their created recipes
    f. Management:
        - Admin can delete plagiaristic recipe

(3) Web pages:
    - Home page: 
        1. This is also the landing page users will see when they visit our website. 
        2. Content including randomly generalized recipe cards.
        3. Before login, users can view, search, and open detailed recipe information but are unable to comment and save.
    - User login: 
        1. Login form
        2. Link to registration page
    - Register
        1. Register form contains :
            a. Username(required)
            b. Password(required)
            c. Email(required)
            d. Phone number
            e. Profile picture
        2. Will render to the User Login page after an account has been successfully created.
    - User profile
        1. Display public information including username, profile picture.
        2. Private information like password, email will be hidden for other users.
        3. Users are allowed to update their own profile.
    - Search Result
        1. Display recipe cards based on user’s input information
        2. Can navigate to the Detail Recipe page after clicking a specific recipe card.
    - Detail Recipe information 
        1. Display recipe’s picture, description, ingredients, measures, and comments.
        2. Users can post, edit their own comment, and save/ favorite  after logged in. 
    -  Post recipe
        1. This page can only be accessed by chef or admin. 
        2. Post form including image, video, description, ingredients ,and measures.
        3. 
(4) Requirement to work with data:

(5) Description of API:
    https://www.themealdb.com/api.php
    Its an open online database of food meal recipes. It allows features like uploading meal images, browsing meals in sequence, categorizing meals 

