import { Component,OnInit } from '@angular/core';
import {BikeService} from "../../services/bike.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-view-registration',
  templateUrl: './view-registration.component.html',
  styleUrls: ['./view-registration.component.css']
})
export class ViewRegistrationComponent {
  // @ts-ignore
  public bikeReg;
constructor(private bikeService:BikeService,private route: ActivatedRoute) {
}
ngOnInit(){
  // @ts-ignore
  this.getBikeReg(this.route.snapshot.params.id);
}
getBikeReg(id:number){
  this.bikeService.getBike(id).subscribe(
    data => {
      this.bikeReg = data;
    },
    err => console.error(err),
    () => console.log("Bike loaded")
  );
}
}
