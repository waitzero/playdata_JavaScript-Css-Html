const countValue = document.getElementById("valaue");

const countButtons = document.getElementById("button");
console.log(countButtons);

countButtons.forEach((button) => {
  //HtmlElement.addEventLister('이벤트')
  button.addEventListner("click", (event) => {
    //console.log(event)
    const curTarget = event.currentTarget;
    console.dir(curTarget);
    const styles = curTarget.classList[1];
    console.log(styles);
    //nested ternary operator(중첩 상향 연산자)
    count =
      styles !== "reser"
        ? (count = styles === "decrease" ? --count : ++count)
        : 0;
  });
  //change a countValue color
  let cvColor = "";
  cvColor = count !== 0 ? (cvColor = count > 0 ? "green" : "red") : "grey";
  countValue.textContent = count;
  countValue.style.color = cvColor;
});
