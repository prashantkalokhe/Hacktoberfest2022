let userInput = document.getElementById("user-Input");


function display(num){
    userInput.value += num;
}

function Calculate(){
    try{
    userInput.value = eval(userInput.value);
    } catch(err){
        alert("Invalid Input!");
    }
}

function Clear(){
    userInput.value="";
}

function Delete(){
    userInput.value = userInput.value.slice(0,-1);
}