ArrayList<Integer>x=new ArrayList<Integer>(),y=new ArrayList<Integer>();
int w=30,h=30,blocks=20,direction=2,fx=15,fy=15,fc1=255,fc2=255,fc3=255,speed=8;
int[] x_dir={0,0,1,-1},y_dir={1,-1,0,0};
boolean gameover=false;



void setup(){
  size(600,600);
  x.add(0);
  y.add(15);
}


void draw(){
  background(0);
  fill(#084D15);
  for(int i =0 ; i<x.size();i++)
{rect(x.get(i)*blocks,y.get(i)*blocks,blocks,blocks);}

if(!gameover){
fill(fc1,fc2,fc3);
ellipse(fx*blocks+10,fy*blocks+10,blocks,blocks);
textAlign(LEFT);
textSize(25);
fill(255);
text("Score: "+ x.size(),10,10,width - 20,50);

  if(frameCount%speed==0){
  x.add(0,x.get(0)+x_dir[direction]);
  y.add(0,y.get(0)+y_dir[direction]);
  
  
  
  
  if(x.get(0)<0 || y.get(0)<0 || x.get(0)>=w || y.get(0)>=h) gameover=true;
  
  for(int i =1; i<x.size();i++)
   {if(x.get(0)==x.get(i) && y.get(0)==y.get(i)) gameover=true;}
  
  
  
  if(x.get(0)==fx && y.get(0)==fy){
     if(x.size()%2==0 && speed>=2) speed-=1;
  fx=(int)random(0,w);
  fy=(int)random(0,h);
  fc1=(int)random(255);
  fc2=(int)random(255);
  fc3=(int)random(255);
  
  }
   else{
   x.remove(x.size()-1);
   y.remove(y.size()-1);
   }
}
  }
  else{
  fill(200,200,0);
  textSize(30);
  textAlign(CENTER);
  text("GAME OVER \n Your Score is : "+x.size()+"\n Press Enter", width/2,height/3);
 if(keyCode == ENTER){
 x.clear();
 y.clear();
 x.add(0);
 y.add(15);
 direction=2;
 speed=8;
 gameover= false;
 
 }
}
  
  
 //keyPressed();
 
}


void keyPressed(){

int newdir=keyCode==DOWN?  0:(keyCode==UP?1:(keyCode==RIGHT?2:(keyCode==LEFT?3:-1)));
if(newdir != -1){
direction = newdir;
}

}
