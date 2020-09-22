import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ContainersService {

  API = environment.url;

  constructor(private http: HttpClient) { }

  list() {
    return this.http.get(`${this.API}/containers`)
  }

  get(id) {
    return this.http.get(`${this.API}/containers/${id}`)
  }

  save(container) {
    if (container._id) return this.http.put(`${this.API}/container/${container._id}`, container)
    return this.http.post(`${this.API}/container`, container)
  }

  delete(id) {
    return this.http.delete(`${this.API}/container/${id}`, id)
  }
}
