import { Component, Inject, OnInit } from '@angular/core';
import { MatDialogRef,MAT_DIALOG_DATA } from '@angular/material/dialog';
import { MatCard } from '@angular/material/card';
import { ApiService } from '../services/api.service';

@Component({
  selector: 'app-cart-dialog',
  templateUrl: './cart-dialog.component.html',
  styleUrls: ['./cart-dialog.component.scss']
})
export class CartDialogComponent implements OnInit {

  constructor( private dialogRef : MatDialogRef<CartDialogComponent>,
    @Inject( MAT_DIALOG_DATA) public items:any,
   private api: ApiService) {
   
    }

  ngOnInit(): void {
    console.log(this.items);
    this.noNull();
    console.log(this.billing);
    this.disabledFunc();
    
    

  }
  private billing:any[]=[];
  isDisabled:boolean=false;
 

  noNull(){
    this.billing = this.items.filter((item:any )=> item.items !== 0);

    
  }

 disabledFunc(){
  if(this.billing.length==0){
    this.isDisabled=true;
  }
  else{
    this.isDisabled=false;
  }
 }



  saving(){

   
    
    
    this.api.saveBill(this.billing).subscribe({next:(res)=>{
      alert("Bill confirmed");
      console.log(res);
      this.dialogRef.close();
    },
    error:()=>{
      alert("Error while adding")
    }
    })
  //   this.dialogRef.close.subscribe(res=>{
  //     if(res){
  //       console.log("saved")
  //         this.api.saveBill(res).subscribe(response=>{
  //           alert("Successfull");         
  //     });
  //   }
  // })

  }


  
  
 

  }


