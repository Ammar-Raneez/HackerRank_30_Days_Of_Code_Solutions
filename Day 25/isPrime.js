function processData(input) {
  const inputArr = input.split("\n").map((num) => Number(num));

  const isPrime = (n) => {
    // If a number isn't divisible by a number between 2 and root(number)
    // That number is prime
    for (let i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  };

  for (let i = 1; i <= inputArr[0]; i++) {
    let n = inputArr[i];
    if (n >= 2 && isPrime(n)) {
      console.log("Prime");
    } else {
      console.log("Not prime");
    }
  }
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
  _input += input;
});

process.stdin.on("end", function () {
  processData(_input);
});
