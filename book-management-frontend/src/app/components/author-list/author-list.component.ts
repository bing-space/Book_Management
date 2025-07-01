import { Component, OnInit } from '@angular/core';
import { Author } from 'src/app/common/author';
import { AuthorService } from 'src/app/services/author.service';

@Component({
  selector: 'app-author-list',
  templateUrl: './author-list.component.html',
  styleUrls: ['./author-list.component.css']
})
export class AuthorListComponent implements OnInit{

  authors: Author[] = [];

  constructor(private authorService: AuthorService){}

  ngOnInit(): void {
    this.listAuthors();
  }

  listAuthors(){
    this.authorService.getAuthorList().subscribe(
      data => {
        this.authors = data;
        console.log(this.authors)
      }
    )
  }
}
