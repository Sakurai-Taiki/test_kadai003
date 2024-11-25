 const stripe = Stripe('pk_test_51QJQLVFoKQ3torxMB1X4ARDwjc16EJx5v5E96bUy7nWAr0G5Yjeegh38FBEfXsTKzVbqLneYzcAEgmBARt1y4trL00ThM6o4D9');
 const paymentButton = document.querySelector('#paymentButton');
 
 paymentButton.addEventListener('click', () => {
   stripe.redirectToCheckout({
     sessionId: sessionId
   })
 });
