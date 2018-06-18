PImage rainbow;
PImage unicorn;

void setup (){
rainbow=loadImage("rainbow.jpg");
  size (1000,800);
rainbow.resize (width, height);

unicorn=loadImage("unicorn.png");
unicorn.resize (200, 150);
}
void draw (){
background (rainbow);
  image(unicorn, mouseX, mouseY);
}