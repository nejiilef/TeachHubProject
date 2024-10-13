import { ChangeDetectorRef, Component } from '@angular/core';
import { Router } from '@angular/router';
import { MenuItem } from 'primeng/api';
import { AuthService } from './auth/service/auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'TeachHub';
  isMenuVisible!: boolean;
  
  test!:boolean;
  constructor(private router : Router,private serviceAuth:AuthService,private cdr: ChangeDetectorRef){}
  
  ngDoCheck(): void {
    let currentroute = this.router.url;
    let role=localStorage.getItem('role');
    let jwt=localStorage.getItem('jwt');
    if(role='etudiant'){
      this.test=false;
    }
    else{
      this.test=true
    }
   
    if (currentroute == '/auth/login' || currentroute == '/auth/register/enseignant' || currentroute == 'auth/register/etudiant' || currentroute == 'auth') {
      this.isMenuVisible = false
    } else {
      this.isMenuVisible = true}
    };
    
 
}
