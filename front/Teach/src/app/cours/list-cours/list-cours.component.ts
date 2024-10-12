import { Component } from '@angular/core';
import { ICours } from '../model/icours';
import { CoursService } from '../service/cours.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-list-cours',
  templateUrl: './list-cours.component.html',
  styleUrls: ['./list-cours.component.css']
})
export class ListCoursComponent {
  btStyle={'border-radius': '4px','background-color':'red','color':'white','border-color':'red','text-align':'center'}
  cours!:ICours[];
  constructor(private service:CoursService,private router:Router){}
    ngOnInit(): void {
      this.service.getAllCours().subscribe((r)=>this.cours=r);
    }
  
    deleteCours(id:number){
      this.service.deleteCours(id).subscribe((response)=>{
        this.router.navigate(['cours']);
        this.ngOnInit();
      })
    }
}
