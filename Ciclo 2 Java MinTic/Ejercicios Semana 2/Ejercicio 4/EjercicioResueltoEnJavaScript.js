//vector = [3, 20, 1, 0, 66, 78, 12, 11, 90, 13];
vector = [900, 125, 1, 3];
for (var i = 0; i <= vector.length / 2 - 1; i++) {
  for (var j = 1; j <= vector.length / 2 - 1; j++) {
    if (i >= j) {
      j = i;
    }
    if (vector[i] > vector[j]) {
      aux = vector[i];
      vector[i] = vector[j];
      vector[j] = aux;
    }
  }
}
for (var i = vector.length / 2; i <= vector.length - 1; i++) {
  for (var j = vector.length / 2 + 1; j <= vector.length - 1; j++) {
    if (i >= j) {
      j = i;
    }
    if (vector[i] < vector[j]) {
      aux = vector[i];
      vector[i] = vector[j];
      vector[j] = aux;
    }
  }
}
console.log("VECTOR " + vector);
