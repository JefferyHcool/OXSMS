<template>
  <div class="login-container">
      <div class="login-main">
            <div class="login-pic">
             <div class="login-intro">
                   <div class="intro">
                       <img  src="../assets/LOGOS.png" alt="">
                        <div class="login-title">
                            OXSMS
                        </div>
                   </div>
                </div> 
            <img id="pic1" src="../assets/login.png" alt="">
        </div>
        <div class="login-form">
            <div class="login-title" >
                OXSMS
            </div>
            <div class="login-title" id="t-in" >
                津桥学生管理系统
            </div>
            <div class="l-form">
                <div class="login-account">
                        <i class="el-icon-coordinate"></i>
                    <el-input
                    placeholder="账号"
                    v-model="info.account"
                    clearable>
                    </el-input>
                </div>
                <div class="login-account">
                        <i class="el-icon-lock"></i>
                    <el-input
                    show-password
                    placeholder="密码"
                    v-model="info.password"
                    clearable>
                    </el-input>
                </div>
            </div>
            <div class="login">
                 <el-button type="primary" >登录</el-button>
            </div>
      </div>
      </div>
  </div>
</template>

<script>
export default {
  name: 'login',
  data() {
      return {
          "info":{
              "account":"",
              "password":"",
          }
      }
  },
}

</script>

<style>
.login-container{
    height: 100%;
    background-color: #f3f2f2;
    display: flex;
    flex-direction: row;
    justify-content: center;
    align-items: center;
}
.login-main{
    width: 60%;
    height: 60%;
    background-color: aquamarine;
    display: flex;
    box-shadow: 0 2px 12px 0 rgba(0, 0, 0, 0.1);
    border-radius: 8px;
    overflow: hidden;
}
.login-pic{
    width: 40%;
    background-color: #aa1;
    overflow: hidden;
    position: relative;
    
}
.login-form{
    margin: 0 !important;
    width: 60%;
    background-color: #fff;
}
.login-form p{
    font-size: 30px;
}
.login-pic img{
    width: 300%;
    height: 100%;
    transition: all 0.6s ease-in-out;

}
.intro{
    display: flex;
    align-items: center;
}
.intro img{
    width: 80%;
    height: 20%;
}
.login-pic:hover #pic1{
    transform: scale(1.05);
    filter: brightness(80%);
}
.login-pic .login-intro{
    width: 100%;
    height: 100%;
    position: absolute;
    font-size:20px ;
    z-index: 1;
    color: rgb(255, 255, 255);
    display: flex;
    justify-content: center;
    margin: 0;
   
 
    /* background-color: aliceblue; */
}

.login-intro .intro{
    display: flex;
    flex-direction: column;
    justify-content: center;
    transition: all 0.8s ease-in-out ;

}
.login-pic :hover .intro {
    transform: scale(1.1);
}
.login-form {
    display: flex;
    flex-direction: column;
    align-items: center;
}
.login-form .login-title{
    margin-top: 20px;
    padding:5px 20px ;
    color: #ffffff;
    font-size: 30px;
    background-color: #409EFF;
}
#t-in{
    padding: 0;
     margin-top: 8px;
     color: #548cc4;
     background-color: #fff;
     font-size: 12px;
}
.l-form{
    margin-top: 40px;
}
.login-account{
    width: 70%;
    display: flex;
    margin: 20px 0;
}
.login-account i{
    width: 40px;
    font-size: 30px;
    color: #000000;
    opacity: 40%;
    margin: 2px 4px;
}
 .login-account .el-input__inner{
    width: 12.5rem !important;
    height: 2.125rem;
}
.intro .login-title{

    padding:5px 15px ;
    color: #ffffff;

    background-color: #409EFF;
}
</style>
<style scope>
    .myClass{
        width: 10px !important;
        color:rgb(94, 57, 57);
    }
</style>