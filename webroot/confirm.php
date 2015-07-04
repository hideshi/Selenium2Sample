<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="ja">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <title>Selenium2 Sample</title>
  <meta name="viewport" content="width=1024, maximum-scale=1, user-scalable=yes">
  <meta name="keywords" content="Selenium2,Test"/>
  <meta name="description" content="This page is for automated testing using Selenium2."/>
  <script src="./js/jquery.js"></script>

</head>
<body>
<?php
    $text = $_POST['text'];
    $password = $_POST['password'];
    $textarea = $_POST['textarea'];
    $hidden = $_POST['hidden'];
    $radio = $_POST['radio'];
    $checkbox1 = !empty($_POST['checkbox1'])? 1 : 0;
    $checkbox2 = !empty($_POST['checkbox2'])? 1 : 0;
    $select = $_POST['hidden_select'];
    $date = $_POST['date'];
    $file = $_POST['file'];
?>
  <form id="form" type="file" method="POST">
    <table>
    <tr>
      <td>
        <label for="text">Text Box</label>
      </td>
      <td>
        <label id="text" name="text" value="<?php echo $text;?>"><?php echo $text;?></label>
      </td>
    </tr>

    <tr>
      <td>
        <label for="password">Password</label>
      </td>
      <td>
        <label id="password" name="password" value="<?php echo $password;?>"><?php echo $password;?></label>
      </td>
    </tr>

    <tr>
      <td>
        <label for="textarea">Text Area</label>
      </td>
      <td>
        <label id="textarea" name="textarea" value="<?php echo $textarea;?>"><?php echo $textarea;?></label>
      </td>
    </tr>

    <tr>
      <td>
        <label for="hidden">Hidden Field</label>
      </td>
      <td>
        <label id="hidden" name="hidden" value="<?php echo $hidden;?>"><?php echo $hidden;?></label>
      </td>
    </tr>

    <tr>
      <td>
    <label for="radio">Radio Button</label>
      </td>
      <td>
        <label id="radio" name="radio" value="<?php echo $radio;?>"><?php echo $radio;?></label>
      </td>
    </tr>

    <tr>
      <td>
        <label for="checkbox1">Check Box 1</label>
      </td>
      <td>
        <label id="checkbox1" name="checkbox" value="<?php echo $checkbox1;?>"><?php echo $checkbox1;?><label>
      </td>
    </tr>

    <tr>
      <td>
        <label for="checkbox2">Check Box 2</label>
      </td>
      <td>
        <label id="checkbox2" name="checkbox" value="<?php echo $checkbox2;?>"><?php echo $checkbox2;?></label>
      </td>
    </tr>

    <tr>
      <td>
        <label for="select">Select</label>
      </td>
      <td>
        <ul id="select">
          <li value="<?php echo $select;?>"><?php echo $select;?></li>
        </ul>
      </td>
    </tr>

    <tr>
      <td>
        <label for="date">Date</label>
      </td>
      <td>
        <label id="date" name="date" value="<?php echo $date;?>"><?php echo $date;?></label>
      </td>
    </tr>

    <tr>
      <td>
        <label for="file">File Upload</label>
      </td>
      <td>
        <label id="file" name="file" value="<?php echo $file;?>"><?php echo $file;?></label>
      </td>
    </tr>

    <tr>
      <td>
        <label for="back">Back</label>
      </td>
      <td>
        <button id="back" name="back">BACK</button>
      </td>
    </tr>

    <tr>
      <td>
        <label for="submit">Submit</label>
      </td>
      <td>
        <input type="submit" id="submit" name="submit" value="SUBMIT"/>
      </td>
    </tr>

    </table>
  </form>
  <script>
    jQuery(function($) {
    });
  </script>
</body>
</html>
