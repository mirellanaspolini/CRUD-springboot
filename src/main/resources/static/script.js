(function () {
    $("#cidades").on("click", ".btnExcluirCidade", function () {
        let botaoClicado = $(this);
        $("#btnExcluir").attr("data-id", botaoClicado.attr("data-id"));
        $("#modalExcluir").modal("show");
    });

    $("#btnExcluir").on("click", function () {
        let botaoSim = $(this);
        let id = botaoSim.attr("data-id");
        $.ajax({
            url: "/cidades/delete/" + id,
            method: "GET",
            success: function () {
                window.location.href = "/cidades";
            },
        });
    });
})();
