function sayHello() {
  for (var i = 0; i < 10; i++ ) { // O(n)
    console.log(i);
  }
  
  var i=0;
  while(i<10){ // O(n)
    console.log(i);
    i++;
  }
  
  var i=10; // O(logn)
  while(i > 1) {
    console.log(i);
    i = i/2;
  }
  
  for (var i = 0; i < 10; i++ ) { // O(n2)
    for (var j = 0; j < 10; j++ ) {
      console.log(i+j);
    }
  }
  
  for (var i = 0; i < 10; i++ ) { // O(n2)
     var j=0;
     while(j<10){
       console.log(j);
       j++;
     }
  }

  for (var i = 0; i < 10; i++ ) { // O(n logn)
     var i=10; // O(log n)
     while(i > 1) {
       console.log(i);
       i = i/2;
     }
  }
}
  
  function binarySearch(arr, num) { // O(logn)
    var start = 0;
    var end = arr.length;
    
    while(start < end){
      
      var mid = Math.floor((start + end) / 2);
      if (arr[mid] < num) {
          start = mid;
      }
      else if(arr[mid] > num) {
          end = mid;
      }
      else {
        console.log("Number found");
        break;
      }
    }
  
    
  }

binarySearch([1,2,3,4,5,6,7,8,9], 8);
