<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>OneStopShop</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            background: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        h1 {
            font-size: 28px;
            color: #333333;
        }
        p {
            font-size: 16px;
            color: #555555;
            margin-bottom: 20px;
        }
        select, button {
            padding: 10px 15px;
            font-size: 16px;
            margin: 10px 0;
            border: 1px solid #cccccc;
            border-radius: 4px;
            width: 100%;
            max-width: 300px;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>OneStopShop</h1>
        <p>One place for all your commercial needs</p>
        <form action="processForm.jsp" method="post">
            <label for="options">Select an Option:</label>
            <select id="options" name="selectedOption">
                <option value="option1">Electronics</option>
                <option value="option2">Clothing</option>
                <option value="option3">Groceries</option>
                <option value="option4">Home Appliances</option>
                <option value="option5">Books</option>
            </select>
            <br>
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
