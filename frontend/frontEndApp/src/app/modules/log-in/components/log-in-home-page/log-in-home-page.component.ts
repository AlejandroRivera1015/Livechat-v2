import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-log-in-home-page',
  standalone: false,
  templateUrl: './log-in-home-page.component.html',
  styleUrl: './log-in-home-page.component.css'
})
export class LogInHomePageComponent implements OnInit {


  public loginMessage : String = ""; 
  public flag : boolean = false;

  private userName : String = ""
  private userPassword : String = "";


  loginForm = new FormGroup({
    userName : new FormControl(''),
    password : new FormControl('' ,[Validators.required])
  });





  loginformSubmit(){
    console.log(this.loginForm.value);
    this.handleloginMessage();
  }

  handleloginMessage():void{

    let tempMessage : String  = "" ;
    this.loginMessage = "";

    tempMessage = !this.flag ? "Welcome to LiveChat! :D" : "Please, \n try again ! :C";

    setTimeout(()=>{
        for(let i = 0; i < tempMessage.length; i++){

          setTimeout(()=>{
            this.loginMessage = this.loginMessage + tempMessage[i];
          },i*10);

        }

        this.flag = true;
    },200);



  }



  ngOnInit(): void {
    this.handleloginMessage();
  }


  constructor(){}









  setName(userName : String){
    this.userName = userName;
  }

  getUserName(){

    return this.userName.length>0 ? this.userName : "user";
  }

  getPassword(){
    return this.userPassword;
  }

  setPassWord(password : String){
    this.userPassword = password;
  }






}