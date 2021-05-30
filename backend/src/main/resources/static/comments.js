async function createComment(e){
   textArea = document.getElementById('commentBody')
   const response = await fetch("/comments/create",{
         method:"POST",
         headers:{"Content-Type":"application/json"},
         body:JSON.stringify({"body": textArea.value})
   })

   console.log(response.json)
}

async function indexComment(e){
    const response = await fetch("/comments/index/Comment")
    const json = await response.json()

    console.log(json)

    container = document.getElementById("commentsContainer")
    json.data.forEach(comment => {
        container.innerHTML += `<p>${comment.body} <br> ${comment.created}</p>`
    });
    
 }

 window.onload = function (){
     document.getElementById("btnSendComment").onclick = createComment
     indexComment()
 }