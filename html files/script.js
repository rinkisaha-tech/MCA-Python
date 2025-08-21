// Menu interactions
document.addEventListener('DOMContentLoaded', function() {
  // Add click effects to menu items
  const menuItems = document.querySelectorAll('.menu-item');
  
  menuItems.forEach(item => {
    item.addEventListener('click', function() {
      // Add a temporary highlight effect
      this.style.background = 'rgba(255, 215, 0, 0.3)';
      setTimeout(() => {
        this.style.background = '';
      }, 200);
    });
  });

  // Add table row hover effects
  const tableRows = document.querySelectorAll('.comparison-table tbody tr');
  
  tableRows.forEach(row => {
    row.addEventListener('mouseenter', function() {
      this.style.backgroundColor = 'rgba(255, 215, 0, 0.2)';
    });
    
    row.addEventListener('mouseleave', function() {
      this.style.backgroundColor = '';
    });
  });
});

// Booking functionality
function openBooking() {
  const bookingFrame = document.getElementById('booking-frame');
  bookingFrame.classList.remove('hidden');
  
  // Smooth scroll to booking section
  bookingFrame.scrollIntoView({ 
    behavior: 'smooth',
    block: 'center'
  });
}

function closeBooking() {
  const bookingFrame = document.getElementById('booking-frame');
  bookingFrame.classList.add('hidden');
}

// Menu section animations on scroll
function animateOnScroll() {
  const sections = document.querySelectorAll('.menu-section');
  
  const observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        entry.target.style.opacity = '1';
        entry.target.style.transform = 'translateY(0)';
      }
    });
  }, {
    threshold: 0.1
  });

  sections.forEach(section => {
    observer.observe(section);
  });
}

// Initialize scroll animations
animateOnScroll();

// Add keyboard navigation
document.addEventListener('keydown', function(e) {
  if (e.key === 'Escape') {
    closeBooking();
  }
});