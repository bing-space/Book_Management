import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map, Observable } from 'rxjs';
import { Author } from '../common/author';

@Injectable({
  providedIn: 'root'
})
export class AuthorService {

  private baseUrl = 'http://localhost:8080/api/book-author';

  constructor(private httpClient: HttpClient) { }

  getAuthorList(): Observable<Author[]>{
    return this.httpClient.get<GetResponse>(this.baseUrl).pipe(
      map(response => response._embedded.bookAuthor)
    )
  }
}

interface GetResponse{
  _embedded: {
    bookAuthor: Author[];
  }
}