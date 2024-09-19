document.getElementById("registerButton").addEventListener("click", function() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    const userData = {
        username: username,
        password: password
    };

    fetch("/api/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(userData)
    })
        .then(response => response.json())
        .then(data => {
            alert(data); // 서버에서 받은 메시지를 alert로 표시
        })
        .catch(error => {
            console.error("Error:", error);
            alert("회원가입 중 오류가 발생했습니다.");
        });
});
