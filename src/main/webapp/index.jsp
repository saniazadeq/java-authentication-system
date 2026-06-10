<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fa" dir="rtl">
<head>
  <meta charset="UTF-8"/>
  <title>ورود / ثبت نام</title>
  <link href="https://fonts.googleapis.com/css2?family=Vazirmatn:wght@300;400;600&display=swap" rel="stylesheet">
  <style>
    body {
      margin: 0;
      font-family: 'Vazirmatn', sans-serif;
      background: linear-gradient(135deg, #2ad4d4, #1fa2ff);
      height: 100vh;
      display: flex;
      justify-content: center;
      align-items: center;
    }

    .box {
      background: #fff;
      width: 360px;
      padding: 30px;
      border-radius: 14px;
      box-shadow: 0 10px 30px rgba(0, 0, 0, 0.15);
    }

    h2 {
      text-align: center;
      margin-bottom: 10px;
    }

    p {
      text-align: center;
      color: #777;
      font-size: 14px;
      margin-bottom: 25px;
    }

    label {
      margin-bottom: 6px;
      display: block;
    }

    input {
      width: 100%;
      padding: 10px;
      margin-bottom: 15px;
      border-radius: 8px;
      border: 1px solid #ccc;
    }

    button {
      width: 100%;
      padding: 12px;
      background: #2ad4d4;
      border: none;
      border-radius: 8px;
      color: #fff;
      font-size: 16px;
      cursor: pointer;
    }

    .link {
      text-align: center;
      margin-top: 15px;
      font-size: 14px;
    }

    .link a {
      color: #1fa2ff;
      cursor: pointer;
      text-decoration: none;
    }

    .hidden {
      display: none;
    }
  </style>
</head>
<body>
<div class="box">

  <!-- LOGIN -->
  <div id="login">
    <h2>ورود</h2>
    <p>اطلاعات حساب خود را وارد کنید</p>
    <form action="login" method="post">
      <label>username</label>
      <input type="text" name="username"/>
      <label>password</label>
      <input type="password" name="password" />
      <label>repassword</label>
      <input type="password" name="repassword" />
      <label>country</label>
      <input type="text" name="country" />
      <label>city</label>
      <input type="text" name="city" />
      <label>address</label>
      <textarea name="address"></textarea>
      <button type="submit">ورود</button>
    </form>
    <div class="link">
      حساب ندارید؟ <a onclick="showRegister()">ثبت نام</a>
    </div>
  </div>

  <!-- REGISTER -->
  <div id="register" class="hidden">
    <h2>ثبت نام</h2>
    <p>ایجاد حساب جدید</p>
    <form action="signup" method="post">
      <label>نام کاربری</label>
      <input type="text" name="username"/>
      <label>رمز عبور</label>
      <input type="password" name="password"/>
      <label>ایمیل</label>
      <input type="email" name="email"/>
      <button type="submit">ثبت نام</button>
    </form>
    <div class="link">
      حساب دارید؟ <a onclick="showLogin()">ورود</a>
    </div>
  </div>

</div>

<script>
  function showRegister() {
    document.getElementById('login').classList.add('hidden');
    document.getElementById('register').classList.remove('hidden');
  }

  function showLogin() {
    document.getElementById('register').classList.add('hidden');
    document.getElementById('login').classList.remove('hidden');
  }
</script>
</body>
</html>