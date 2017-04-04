public void printInOrder() {
  if(root.value == null) {
    printInOrder(this.left);
    printInOrder(this.right);
  } else {
    printInOrder(this.left);
    System.out.println(root.value);
    printInOrder(this.right);
  }
}
    
