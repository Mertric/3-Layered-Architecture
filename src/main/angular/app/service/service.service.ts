import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const URI = './api/v1/main';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(
    private http: HttpClient
  ) {
  }
  
  helloworld(): Observable<string> {
    return this.http.get<string>(`${URI}/hello-world`);
  }


}
