import { Component, OnInit } from '@angular/core';
import { ApiService } from '../services/api.service';

@Component({
  selector: 'app-sold',
  templateUrl: './sold.component.html',
  styleUrls: ['./sold.component.scss']
})
export class SoldComponent implements OnInit {

  constructor(private api: ApiService) { }

  ngOnInit(): void {
    this.getAllItems();
   
  }

  pizza:number=0;
  burger:number=0;
  naan:number=0;
  gobi:number=0;
  expresso:number=0;
  blackCoffee:number=0;

  private allSoldItems:any[]=[];
 
  getAllItems(){
    this.api.getAllItems().subscribe({
       next:(res)=>{
         
        //console.log(res);
        
       this.allSoldItems=res;
       this.countItems();
       
       },
       error:()=>{
         alert('Error While Getting the product !!')
       }
     })
   
   }

   countItems(): void {
    this.allSoldItems.forEach(item => {
      switch (item.name) {
        case 'Pizza':
          this.pizza += item.items;
          break;
        case 'Burger':
          this.burger += item.items;
          break;
        case 'Butter Naan':
          this.naan += item.items;
          break;
        case 'Gobi Manchuri':
          this.gobi += item.items;
          break;
        case 'Expresso':
          this.expresso += item.items;
          break;
        case 'Black Coffee':
          this.blackCoffee += item.items;
          break;
        // Add more cases for other items if needed
      }
    });
  }

  deleteAllItems(){
    console.log("before deleting");
    
    this.api.deleteAllItems().subscribe({
       next:(res)=>{
         
        alert("Deleted");
        console.log("successful deleting");
        this.getAllItems()
       
       },
       error:()=>{
       
         alert('Error While Deleting the product !!')
         
       
       }
     })
     
   
   }
  
  
  
}
