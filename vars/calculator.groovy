def add(String x, String y){
  int value = x.toInteger() + y.toInteger()
  echo "Sum of ${x} and ${y} is ${value.toString()}"
}
def mul(x,y){
  echo "Multiplication of ${x} and ${y} is ${x*y}"
}
def sub(x,y){
  int value = x.toInteger() - y.toInteger()
  echo "Subtraction of ${x} and ${y} is ${value}"
}
def div(x,y){
  echo "Division of ${x} and ${y} is ${x/y}"
}
  
