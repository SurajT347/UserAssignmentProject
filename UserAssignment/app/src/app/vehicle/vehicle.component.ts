import { Component } from '@angular/core';
import { Vehicle } from './Vehicle';
import { HttpClient } from '@angular/common/http';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { UserComponent } from '../user/user.component';
@Component({
  selector: 'app-vehicle',
  standalone: true,
  imports: [UserComponent],
  templateUrl: './vehicle.component.html',
  styleUrl: './vehicle.component.css'
})
export class VehicleComponent {


  vehicleId=undefined
  vehicleNm=undefined
  user:Vehicle=new Vehicle();

  constructor(private http:HttpClient,private router:Router){
  }
    
  getUser( myForm:NgForm ){

    this.vehicleId = myForm.controls["userId"].value;
    this.vehicleNm = myForm.controls["userNm"].value;

    
    console.log(this.vehicleId+"......"+this.vehicleNm)
    this.http.get<Vehicle>("http://localhost:8987/getVehicle/" +this.vehicleId+"/"+this.vehicleNm).subscribe(
  
      
      data=>{
        if(data==null){
          alert("Cant sign In")
        }else{
          console.log(this.vehicleId+"......"+this.vehicleNm)
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
