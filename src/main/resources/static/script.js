fetch("/deepseek")
.then(response=>response.text())
.then(date=>{
    document.getElementById("response-text").textContent = date;
})
        