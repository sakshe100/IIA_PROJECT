<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>OneStopShop</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f7f6;
            margin: 0;
            padding: 0;
        }
        .container {
            width: 100%;
            max-width: 800px;
            margin: 50px auto;
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
            font-size: 36px;
            margin-bottom: 20px;
        }
        textarea {
            width: 100%;
            height: 150px;
            margin-bottom: 20px;
            font-size: 16px;
            padding: 10px;
            border-radius: 8px;
            border: 1px solid #ddd;
            resize: none;
        }
        .btn-submit {
            width: 100%;
            padding: 15px;
            font-size: 18px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .btn-submit:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>SQL Query Executor</h1>

    <form action="result" method="POST">
        <textarea name="sqlQuery" placeholder="Enter your SQL query here..." required></textarea>
        <button type="submit" class="btn-submit">Run Query</button>
    </form>
</div>

</body>
</html>
