import { Component, OnInit,EventEmitter,Output } from '@angular/core';
import {CartDialogComponent} from '../cart-dialog/cart-dialog.component';
import { MatDialog } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';




@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {
  @Output() addToCartClicked = new EventEmitter<number>();

  
  constructor(private dialog: MatDialog,private snackBar: MatSnackBar) { }

  ngOnInit(): void {
  }

  item: number[]=[0,0,0,0,0,0]
  total:number=0;
 

  increment(i:number){
   return this.item[i-1]++;
   
  }

  decrement(i:number){
    if(this.item[i-1]==0){
      return this.item[i-1]
    }
    else{
    return this.item[i-1]--;
    }
  }
  

  openDialog() {
    const dialogRef = this.dialog.open(CartDialogComponent,{
      width:'30%',
      data: this.cardData
    }).afterClosed().subscribe(val=>{
      // if(val=='save'){
      //   this.getAllEmployee();
     // }
    })
  }



  cardData: any[] = [
    { id:1, name: 'Expresso', conditionFlag: false,price:100,items:0,totalAmout:0 },
    { id:2, name: 'Pizza',  conditionFlag: false,price:150 ,items:0,totalAmout:0},
    { id:3, name: 'Burger',  conditionFlag: false ,price:200 ,items:0,totalAmout:0},
    { id:4, name: 'Black Coffee',  conditionFlag: false ,price:75 ,items:0,totalAmout:0},
    { id:5, name: 'Butter Naan',  conditionFlag: false ,price:40 ,items:0,totalAmout:0},
    { id:6, name: 'Gobi Manchuri', conditionFlag: false ,price:70 ,items:0,totalAmout:0},
    // Add more objects as needed
  ];

  

  addingToCart(id: number) {
    this.increment(id);
    this.snackBar.open('Item added to cart', 'Close', {
      duration: 2000, // Snackbar display duration in milliseconds
      
    });
  

    const cardIndex = this.cardData.findIndex(card => card.id === id);
    if (this.cardData[cardIndex].conditionFlag==false) {
      // Update price for the card with the given id
    
      
      this.cardData[cardIndex].conditionFlag=true,
      this.cardData[cardIndex].items++ // Example price change
      this.cardData[cardIndex].totalAmout= this.cardData[cardIndex].items*this.cardData[cardIndex].price
      this.total+=this.cardData[cardIndex].price
      console.log(this.total,this.cardData[cardIndex].conditionFlag);
      
    }
    else{
      
      this.cardData[cardIndex].conditionFlag=true,
      this.cardData[cardIndex].items++
      this.cardData[cardIndex].totalAmout= this.cardData[cardIndex].items*this.cardData[cardIndex].price
      this.total+=this.cardData[cardIndex].price
      console.log(this.total,this.cardData[cardIndex].conditionFlag);
    }
    // 
    
    
  }

  removeFromCart(id: number) {
    this.decrement(id);
   
  

    const cardIndex = this.cardData.findIndex(card => card.id === id);
    if (this.cardData[cardIndex].conditionFlag==true  &&  this.cardData[cardIndex].items>1) {
      // Update price for the card with the given id
      this.snackBar.open('Item removed from cart', 'Close', {
        duration: 2000, // Snackbar display duration in milliseconds
        
      });
    
      
      this.cardData[cardIndex].conditionFlag=true,
      this.cardData[cardIndex].items--; // Example price change
      this.cardData[cardIndex].totalAmout= this.cardData[cardIndex].items*this.cardData[cardIndex].price
      this.total-=this.cardData[cardIndex].price
     // console.log(this.total,this.cardData[cardIndex].conditionFlag,this.cardData[cardIndex].items);
    }
    else if(this.cardData[cardIndex].conditionFlag==true && this.cardData[cardIndex].items==1){
      
      this.snackBar.open('Item removed from cart', 'Close', {
        duration: 2000, // Snackbar display duration in milliseconds
        
      });
      
      this.cardData[cardIndex].items=0;
      this.cardData[cardIndex].conditionFlag=false
      this.cardData[cardIndex].totalAmout= this.cardData[cardIndex].items*this.cardData[cardIndex].price
      this.total-=this.cardData[cardIndex].price
      
     // console.log(this.total,this.cardData[cardIndex].conditionFlag,this.cardData[cardIndex].items);
      
    }
    else{
      console.log("error",this.cardData[cardIndex].conditionFlag,this.cardData[cardIndex].items);
      
    }
    
    
    
  }
  // sum(){
  //   for(let i=1;i<=6;i++){
  //     this.total=this.total+( this.cardData[i].totalAmout)
  //   }
  // }

 

}
