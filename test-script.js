#!/opt/homebrew/bin/node

const output = Object.keys(process.env).reduce(
  (memo, key) => {
    return memo + `<li>${key}</li>`;
  }, "" );

const doc = `<html><body><ul>${output}</ul></body></html>`;

console.log("Content-Type: text/html");
console.log(`Content-Length: ${doc.length}`);
console.log("");
console.log(doc);
