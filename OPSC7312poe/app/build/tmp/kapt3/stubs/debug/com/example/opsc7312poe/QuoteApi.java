package com.example.opsc7312poe;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/opsc7312poe/QuoteApi;", "", "getQuotesByMood", "Lretrofit2/Call;", "", "Lcom/example/opsc7312poe/QuoteResponse;", "mood", "", "app_debug"})
public abstract interface QuoteApi {
    
    @retrofit2.http.GET(value = "/api/quotes/{mood}")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<java.util.List<com.example.opsc7312poe.QuoteResponse>> getQuotesByMood(@retrofit2.http.Path(value = "mood")
    @org.jetbrains.annotations.NotNull
    java.lang.String mood);
}