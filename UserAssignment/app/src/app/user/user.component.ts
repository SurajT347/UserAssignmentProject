import { Component } from '@angular/core';
import { User } from './user';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-user',
  standalone: true,
  imports: [],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent {

  userId=undefined
  userNm=undefined
  user:User=new User();

  constructor(private http:HttpClient,private router:Router){
  }
    
  getUser( myForm:NgForm ){

    this.userId = myForm.controls["userId"].value;
    this.userNm = myForm.controls["userNm"].value;

    
    console.log(this.userId+"......"+this.userNm)
    this.http.get<User>(`http://localhost:8987/getUser/${this.userId}/${this.userNm}`).subscribe(
  
      
      data=>{
        if(data==null){
          alert("Cant sign In")
        }else{
          console.log(this.userId+"......"+this.userNm)
          this.user=data;
          this.router.navigateByUrl("login")
          
        }
      },
      error=>{
        alert("Error")
      }
      
    )

  }

}
 