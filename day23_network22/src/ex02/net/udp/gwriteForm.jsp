<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>방명록 작성 페이지 </title>
</head>
<link href="../css/mystyle.css" type="text/css"  rel="stylesheet" >
<body>
   <div id="header">
      <%@ include file="header.jsp" %>
   </div>
   <div id="menu">
      <%@ include file="menu.jsp" %>
   </div>
   
   <div id="main">
      <form action="gwritePro2.jsp"  method="post">   
         <table>
            <tr>
               <td>이름</td>
               <td><input type="text" name="name" placeholder="이름입력"></td>
            </tr>
            
            <tr>
               <td>E-Mail</td>
               <td><input type="text" name="email" placeholder="email@kosta.or.kr"></td>
            </tr>
            
            <tr>
               <td>HomePage</td>
               <td><input type="text" name="home" placeholder="http://edu.kosta.or.kr"></td>
            </tr>
            
            <tr>
               <td>내   용</td>
               <td>
                  <textarea rows="15" cols="50" name="contents" placeholder="글쓰기"></textarea>
               </td>
            </tr>
            
            <tr>
               <td  colspan="2"  align="center">
                  <input type="submit" value="추 가" > &nbsp;&nbsp;&nbsp;&nbsp;
                  <input type="reset" value="취  소" >
                  <br><br><a href="gdeleteForm.jsp"> <font color="red"> 방명록 지우러 가기</font></a>
                  <br><br><a href="gupdateForm.jsp"> <font color="red"> 방명록 업데이트 가기</font></a>
                  <br><br><a href="greadForm.jsp"> <font color="red"> 목록보기</font></a>
   
               </td>
            </tr>
         </table>
      </form>
   </div>
</body>
</html>








