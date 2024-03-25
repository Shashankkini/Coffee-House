import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }
  url='http://localhost:8080/api/coffeehouse';

  saveBill(data : any){
    return this.http.post<any>(this.url,data)
  }

  getAllItems(){
    return this.http.get<any>(this.url);
  }

  deleteAllItems(){
    return this.http.get<any>(`${this.url}/delete`)
  }
}
